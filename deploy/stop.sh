#!/bin/bash

app=/etc/init.d/app
if [ -L $app ]; then
  $app stop
fi