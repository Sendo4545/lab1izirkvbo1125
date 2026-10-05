package ru.mirea.lab21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task4 {
    public static void DirectoryElements(String[] directory){
        List<String> filelist = new ArrayList<>();
        Collections.addAll(filelist, directory);
        int prints = Math.min(5,filelist.size());
        for (int i = 0; i < prints;i++){
            System.out.println(filelist.get(i));
        }
    }
    public static void main(String[] args){
        String[] folder = {"intput.txt","jojostoneocean.txt","kaizo_knigh.ogg","mus_smile.ogg","wishlist.txt","iwant5.pls"};
        DirectoryElements(folder);
    }
}
