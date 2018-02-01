#!/bin/bash
 
spring_profiles_active=$(cat /opt/report-engine/env-type/spring_profiles_active)
export spring_profiles_active=$spring_profiles_active
echo 'export spring_profiles_active=$spring_profiles_active' >> /etc/bashrc
echo "env="$spring_profiles_active
/etc/init.d/report-engine start