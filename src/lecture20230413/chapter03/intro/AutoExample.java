package lecture20230413.chapter03.intro;

class Auto {
    public Lenkrad lenkrad;
    public Rad[] raeder;
    
    public Auto() {
        this.lenkrad = new Lenkrad();
    }

    public void initRaeder(int anzahl) {
        this.raeder = new Rad[anzahl];
        for(int i = 0; i < anzahl; i ++) {
            this.raeder[i] = new Rad();
        }
    }
    
    public Lenkrad getLenkrad() {
        return lenkrad;
    }
}

class Pkw extends Auto {
    public Pkw() {
        this.initRaeder(4);
    }
}

class Lkw extends Auto {
    public Lkw() {
        this.initRaeder(6);
    }
}

class Lenkrad {
    
}

class Rad {
    
}

public class AutoExample {
    public static void main(String[] args) {
        Lkw lkw = new Lkw();
        Pkw pkw = new Pkw();
        
    }
}
