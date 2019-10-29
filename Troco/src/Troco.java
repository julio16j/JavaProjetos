public class Troco {
    int valor;

    public Troco(int valor) {
        this.valor = valor;
    }

    public static void main(String args[]) {
        Troco troca;

        troca = new Troco(777); //cria um objeto da classe

        System.out.println("\nCedulas de 100: " + troca.getCedulas100());
        System.out.println("\nCedulas de 50: " + troca.getCedulas50());
        System.out.println("\nCedulas de 20: " + troca.getCedulas20());
        System.out.println("\nCedulas de 10: " + troca.getCedulas10());
        System.out.println("\nCedulas de 5: " + troca.getCedulas5());
        System.out.println("\nCedulas de 2: " + troca.getCedulas2());

    }
    public int getCedulas100(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *100 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (100*numcedulas));
        return numcedulas;

    }
    public int getCedulas50(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *50 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (50*numcedulas));
        return numcedulas;

    }
    public int getCedulas20(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *20 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (20*numcedulas));
        return numcedulas;

    }   public int getCedulas10(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *10 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (10*numcedulas));
        return numcedulas;

    } public int getCedulas5(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *5 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (5*numcedulas));
        return numcedulas;

    }public int getCedulas2(){
        int numcedulas;
        for(numcedulas = 0 ; valor > numcedulas *2 ; numcedulas++){

        }
        if(valor != numcedulas * 2  ) numcedulas--;
        valor = (valor - (2*numcedulas));
        return numcedulas;

    }

}