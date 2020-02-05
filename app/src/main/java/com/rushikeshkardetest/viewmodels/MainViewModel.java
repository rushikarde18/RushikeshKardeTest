package com.rushikeshkardetest.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.rushikeshkardetest.model.EmployeeRepository;
import com.rushikeshkardetest.model.Result;

import java.util.List;

public class MainViewModel  extends AndroidViewModel {
    private EmployeeRepository employeeRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        employeeRepository = new EmployeeRepository();
    }

    public LiveData<List<Result>> getAllEmployee() {
        return employeeRepository.getMutableLiveData();
    }
}
