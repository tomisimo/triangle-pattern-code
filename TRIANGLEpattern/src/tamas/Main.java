package tamas;

public class Main {

    public static void main(String[] args) {

        int numarRepetari = 5;
        for (int numarDeInceputRandGol = 1 ; numarDeInceputRandGol <= numarRepetari ; numarDeInceputRandGol++){ //CATE RANDURI DE STELE SA FIE
            for (int numarDeInceputStele = 1 ; numarDeInceputStele <= numarRepetari ; numarDeInceputStele++) { //CATE COLOANE DE STELE SA FIE
                System.out.print(" * ");
            }
            System.out.println();//FUNCTIA PRINT RAND GOL TRECE LA PRINTAREA URMATORULUI RAND DE STELE
        }

        for (int numarDeInceputRandGol = 1 ; numarDeInceputRandGol <= numarRepetari ; numarDeInceputRandGol++){ //CATE RANDURI DE STELE SA FIE
            for (int numarDeInceputStele = 1 ; numarDeInceputStele <= numarDeInceputRandGol ; numarDeInceputStele++) { //CATE COLOANE DE STELE SA FIE
                System.out.print(" * ");
            }
            System.out.println();//FUNCTIA PRINT RAND GOL TRECE LA PRINTAREA URMATORULUI RAND DE STELE
        }

        for (int numarDeInceputRandGol = 1 ; numarDeInceputRandGol <= numarRepetari ; numarDeInceputRandGol++){ //CATE RANDURI DE STELE SA FIE
            for (int numarDeInceputStele = numarDeInceputRandGol ; numarDeInceputStele <= numarRepetari ; numarDeInceputStele++) { //CATE COLOANE DE STELE SA FIE
                System.out.print(" * ");
            }
            System.out.println();//FUNCTIA PRINT RAND GOL TRECE LA PRINTAREA URMATORULUI RAND DE STELE
        }

        for (int numarDeInceputRandGol = 1 ; numarDeInceputRandGol <= numarRepetari ; numarDeInceputRandGol++){
            for (int numarDeInceputSaptiuGol = numarDeInceputRandGol ; numarDeInceputSaptiuGol <= numarRepetari ; numarDeInceputSaptiuGol++){
                System.out.print("  ");
            }
            for (int numarDeInceputSpatiuStea = 1 ; numarDeInceputSpatiuStea <= numarDeInceputRandGol ; numarDeInceputSpatiuStea++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int numarDeInceputRandGol = 1 ; numarDeInceputRandGol <= numarRepetari ; numarDeInceputRandGol++){
            for (int numarDeInceputSpatiuGol = 1 ; numarDeInceputSpatiuGol <= numarDeInceputRandGol ; numarDeInceputSpatiuGol++){
                System.out.print("  ");
            }
            for (int numarDeInceputSpatiuStea = numarDeInceputRandGol ; numarDeInceputSpatiuStea <= numarRepetari ; numarDeInceputSpatiuStea++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();

        int rowNumbers  = 5;
        for (int rowI = 1 ; rowI <= rowNumbers ; rowI++){
            for (int starJ = 1 ; starJ <= rowI ; starJ++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("triangle increasing");
        System.out.println();

        int rowNumber= 5;
        for (int rowI = 1 ; rowI <= rowNumber ; rowI++){
            for (int starJ = rowI ; starJ <= rowNumber ; starJ++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("triangle decreasing");







    }
}
