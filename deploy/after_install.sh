#!/bin/bash

jarDir=/opt/report-engine/
jarFile=$(find $jarDir -name '*.jar' -printf "%f\n" | head -1 ) 
rm -f /etc/init.d/report-engine
ln -s $jarDir$jarFile /etc/init.d/report-engine
echo $jarDir$jarFile