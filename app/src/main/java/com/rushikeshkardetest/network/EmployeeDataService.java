package com.rushikeshkardetest.network;

import com.rushikeshkardetest.model.EmployeeDBResponse;
import com.rushikeshkardetest.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeDataService {
  @GET("api")
  Call<EmployeeDBResponse> getEmployees();
}
