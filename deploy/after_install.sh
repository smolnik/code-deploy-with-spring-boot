#!/bin/bash

jar_dir=/opt/report-engine/
jar_file=$(find $jar_dir -name '*.jar' -printf "%f\n" | head -1 ) 
rm -f /etc/init.d/report-engine
ln -s $jar_dir$jar_file /etc/init.d/report-engine
echo $jar_dir$jar_file