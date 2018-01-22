# kapt-cli
This fork is not really intended to be a cli, but for personal study of how kotlinc works
both for normal compilation and for running kapt.  

The main point is to compile `ap` project as a jar (working :tada:!)
and then use this `.jar` file as the annotation processing for `sample` project, that expects a generated class in it's classpath

## Usage
`./clean && ./kapt`


### Current problems

* kapt will fail with `'com.sun.tools.javac.util.Context' class can't be found ('tools.jar' is absent in the plugin classpath). Kapt won't work.` even when tools.jar *is* on the classpath. But if you uncomment `ANNOTATION_PROCESSOR` which uses `-gradle` annotation processing jar, it will recognize.  
The `-gradle` jar is not public (does not come with kotlin runtime libs), and had to be taken from gradle local cache.
(`-maven` apt will give the same error as the default one)

* Even when using `-gradle`, an internal Abstract error happens which is very hard to debug
