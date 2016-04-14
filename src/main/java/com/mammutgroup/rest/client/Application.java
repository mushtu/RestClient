package com.mammutgroup.rest.client;

import com.google.gson.Gson;

/**
 * @author mushtu
 * @since 4/14/16.
 */
public class Application {

    public static void main(String[] args)
    {
        Gson gson = new Gson();
        System.out.println(gson.toJson(CoreUtil.createEmployee()));


    }


}
