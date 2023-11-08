package com.example.PG.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Constant {

     public String  Sucess  = "200" ;
     public  String Error = "404";

    public String getSucess() {
        return Sucess;
    }

    public void setSucess(String sucess) {
        Sucess = sucess;
    }
}
