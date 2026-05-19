package practice.level7;

public class task16 {
  public  static void main(String[] args) {
        int[][] zoneTemperatures = {
                {10,20,30},
                {100,200},
                {1000,2000,3000,4000}
        };

        int max=zoneTemperatures[0][0];

        for(int i=0;i<zoneTemperatures.length;i++) {
            for(int j=0;j<zoneTemperatures[i].length;j++) {
                if(zoneTemperatures[i][j]>max) {
                    max=zoneTemperatures[i][j];
                }
            }

        }

      System.out.println(max);


  }

 }
