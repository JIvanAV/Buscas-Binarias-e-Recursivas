package Buscas;

public class Busca implements Busca_IF{
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public int[] geraVetorNumericoOrdenado (int tamanho){
        int[] arrayInt = new int[tamanho];                                      //primeiro: 0            último: tamanho - 1
        
        for (int i = 0; i != arrayInt.length; i++){
            arrayInt[i] = i;
        }
       
        return arrayInt;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public boolean buscaLinear_iterativa   (int[] numeros, int num){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == num){
                return true;                                                    // se tiver encontrado
            }
        }
        return false;                                                           //Se não achar
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public boolean buscaLinear_recursiva   (int[] numeros, int num){
        return BLR(numeros,numeros[0],num);
    }
    private boolean BLR                    (int array[], int first, int num){
        if (first == array.length)   {return false;}                            //não encontrou
        
        else if (array[first] == num){return true;}                             //encontrou
        
        else                         {return BLR (array, first+1, num); }       //caso recursivo
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public boolean buscaBinaria_iterativa  (int[] numeros, int num){
        int first     = numeros[0];                                             //first = 0;
        int last      = numeros.length;
        int mid       = (first + last)/2;
        boolean verif = false;                                                  //se permanecer não encontrado
        
        while (first <= last){
            if     ( numeros[mid] < num ) {first = mid + 1;}
            else if( numeros[mid] == num ){verif = true; break;}                //encontrado
            else                          {last  = mid - 1;}  
            mid =  (first + last)/2; 
        }
        return verif;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public boolean buscaBinaria_recursiva  (int[] numeros, int num){
        return BBR(numeros, numeros[0], numeros.length, num);
    }
    private static boolean BBR(int numeros[], int first, int last, int num){
        
        if(last >= first){
            int mid = (first + last)/2;
            
            if(numeros[mid] == num){return true;}
            
            if(numeros[mid] > num) {return BBR(numeros, first, mid-1, num);}    //caso recursivo 1
            else                   {return BBR(numeros, mid+1, last, num); }    //caso recursivo 2
        }
        return false;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
}
