/* Farewell Companion - ZygiskNext module
 * Auto-loaded by ZygiskNext from /data/adb/modules/farewell/zygisk/
 * No conflict - ZygiskNext loads ALL modules simultaneously */
#include <cstdio>
#include <cstring>
#include <string>
#include <vector>
#include <android/log.h>
#define LOGTAG "Farewell"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOGTAG, __VA_ARGS__)
struct Override { char pkg[128]; char prop[96]; char value[96]; };
static std::vector<Override> g_overrides;
static bool g_loaded = false;

static void get_foreground_pkg(char* out, int max) {
  out[0]=0; FILE* fp=popen("dumpsys window 2>/dev/null|grep mCurrentFocus|head -1","r");
  if(!fp)return; char line[256]={};
  if(!fgets(line,sizeof(line),fp)){pclose(fp);return;}
  for(auto p:{"com.","org.","io.","app."}) {
    const char*s=strstr(line,p); if(!s)continue;
    const char*e=strchr(s,'/'); if(!e)e=strchr(s,' ');
    if(e){int l=(int)(e-s);if(l>max-1)l=max-1;memcpy(out,s,l);out[l]=0;}
    break;
  } pclose(fp);
}

static void load_config() {
  if(g_loaded)return;
  FILE*f=fopen("/data/local/tmp/farewell_companion_config.json","r");
  if(!f){g_loaded=true;return;}
  char line[512];
  while(fgets(line,sizeof(line),f)){
    char p[128]={},pr[96]={},v[96]={};
    if(sscanf(line," %*[^\"]\"%127[^\"]\"%*[^\"]\"%95[^\"]\"%*[^\"]\"%95[^\"]\" ",p,pr,v)>=3){
      Override o; strncpy(o.pkg,p,sizeof(o.pkg)-1);
      strncpy(o.prop,pr,sizeof(o.prop)-1);
      strncpy(o.value,v,sizeof(o.value)-1);
      g_overrides.push_back(o);
    }
  } fclose(f); g_loaded=true; LOGI("Loaded %zu overrides",g_overrides.size());
}

extern "C" void __system_property_get(const char* name, char* value) {
  load_config();
  if(!g_overrides.empty()){ char pkg[128]={};
    get_foreground_pkg(pkg,sizeof(pkg));
    if(pkg[0]) for(auto& o:g_overrides)
      if(strcmp(o.pkg,pkg)==0&&strcmp(o.prop,name)==0)
      { strncpy(value,o.value,92);value[91]=0;return; }
  }
}