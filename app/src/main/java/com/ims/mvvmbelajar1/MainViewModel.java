package com.ims.mvvmbelajar1;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainViewModel  extends AndroidViewModel {

    private CoronaRepository coronaRepository;
    public MainViewModel(@NonNull Application application) {
        super(application);
        coronaRepository = new CoronaRepository();
    }
    public LiveData<List<Corona>> getAllCorona() {
        return coronaRepository.getMutableLiveData();
    }
}