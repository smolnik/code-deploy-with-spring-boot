#!/bin/bash

spring_profiles_active=$(cat /opt/report-engine/spring_profiles_active)
export spring_profiles_active=$spring_profiles_active
rm -rf /opt/report-engine/*