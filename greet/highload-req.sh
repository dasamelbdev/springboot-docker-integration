#!/bin/bash

for i in {1..8000000}
 do
    curl http://192.168.99.101:30394/api/hello
 done

