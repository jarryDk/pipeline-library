#!/usr/bin/env groovy

def call(String name = 'human') {

  def hello = getHello ${name}

  sayHello ${hello}

}