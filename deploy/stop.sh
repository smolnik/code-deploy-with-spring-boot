#!/bin/bash

report_engine=/etc/init.d/report-engine
if [ ! -L $report_engine ]; then
    $report_engine stop
fi