package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parse {
   static JSONArray albums =  null;
    public static String parse(String responseBody){
         albums = new JSONArray(responseBody);
        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");
            System.out.println(id + " " + title + " " + userId);
        }
        return null;
    }

    public static void getByIndex(int index){
        System.out.println(albums.getJSONObject(index));
    }
}
