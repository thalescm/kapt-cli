# kapt-cli
This fork is not really intended to be a cli, but for personal study of how kotlinc works
both for normal compilation and for running kapt.  

The main point is to compile `ap` project as a jar (working :tada:!)
and then use this `.jar` file as the annotation processing for `sample` project, that expects a generated class in it's classpath
