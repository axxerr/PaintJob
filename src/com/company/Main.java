package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26,-0.75));
    }
    public static  int  getBucketCount(double width,double height,double  areaPerBucket,int extraBucet){
      double total=0;
     double fin=0;
     int ret=0;
      if (width<=0||height<=0||areaPerBucket<=0||extraBucet<=0){
          return -1;

      }else {
          total = ((width * height) / areaPerBucket) - extraBucet;
           fin=Math.ceil(total);
         ret=(int)fin;

      }
        return ret;
    }
    public static  int  getBucketCount(double width,double height,double  areaPerBucket){
        double total=0;
        double fin=0;
        int ret=0;
        if (width<=0||height<=0||areaPerBucket<=0){
            return -1;

        }else {
            total = ((width * height) / areaPerBucket) ;
            fin=Math.ceil(total);
            ret=(int)fin;

        }
        return ret;
    }
    public static  int  getBucketCount(double area,double  areaPerBucket){
        double total=0;
        double fin=0;
        int ret=0;
        if (area<=0||areaPerBucket<=0){
            return -1;

        }else {
            total = area / areaPerBucket ;
            fin=Math.ceil(total);
            ret=(int)fin;

        }
        return ret;
    }
}
