#!/bin/bash

report-engine=/etc/init.d/report-engine
if [ ! -L $report-engine ]; then
    $report-engine stop
fi