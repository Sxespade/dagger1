package com.example.myapplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModule.class})
interface MyComponent {
    Vehicle provideVehicle();

    void inject(MainActivity main);

    void sss();
}