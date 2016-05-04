#!/bin/bash
mvn -B -U -Pdocker clean package docker:build -DpushImageTag deploy
