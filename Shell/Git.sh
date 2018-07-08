#!/bin/sh

name=`find ./ -name .git`
for file in $name; do
    echo $file
    cd $file
    cd ..
    git add .
    git commit -m "Update"
    git push origin master
    cd ..
done
