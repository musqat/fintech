#!/bin/sh

# Setting Versions
VERSION='1.0.1'

cd ..
./gradlew clean build -x test

ROOT_PATH=`pwd`
echo $ROOT_PATH

echo 'API docker Image Build...'
cd $ROOT_PATH/api && docker build -t api:$VERSION .
echo 'API docker Image Build... Done'

echo 'CONSUMER docker Image Build...'
cd $ROOT_PATH/consumer && docker build -t consumer:$VERSION .
echo 'CONSUMER docker Image Build... Done'

echo 'CSS Image docker Build...'
cd $ROOT_PATH/css && docker build -t css:$VERSION .
echo 'CSS Image docker Build... Done'

echo 'nginx Image docker Build...'
cd $ROOT_PATH/nginx  && docker build -t nginx:$VERSION .
echo 'nginx Image docker Build... Done'