package dev.archfoundry.marsphotosapp

import android.app.Application
import dev.archfoundry.marsphotosapp.data.AppContainer
import dev.archfoundry.marsphotosapp.data.DefaultAppContainer

class MarsPhotosApliction : Application(){
    lateinit var conteiner : AppContainer

    override fun onCreate() {
        super.onCreate()
        conteiner = DefaultAppContainer()
    }
}
