#!/bin/bash

jar_dir=/opt/app/
jar_file=$(find $jar_dir -name '*.jar' -printf "%f\n" | head -1 ) 
rm -f /etc/init.d/app
ln -s $jar_dir$jar_file /etc/init.d/app
echo $jar_dir$jar_file