package com.example.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class MyModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        System.out.println("1111");
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        System.out.println("2222");
        return new Vehicle(new Motor());
    }
}
