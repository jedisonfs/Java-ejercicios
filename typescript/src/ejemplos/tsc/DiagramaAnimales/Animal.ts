 abstract class Animal {

    abstract  respirar(): void;

    abstract morir(): void;

    abstract comer(): void;

    abstract desplazarse(): void;

    abstract nacer(): void;
}

abstract class Vertebrados extends Animal {
    abstract respirar(): void;
}

abstract class Reptil extends Vertebrados {

    desplazarse(): void {
        console.log("me desplazo en 4 patas");
    }

    reproducirse(): void {
        console.log("Sexualmente");
    }

    nacer(): void {
        console.log("De un huevo");
    }
}

class Cocodrilo extends Reptil {

    comer(): void {
        console.log("Soy carnivoro");
    }

    desplazarse(): void {
        console.log("Me desplazo en 4 patas");
    }
    
    reproducirse(): void {
        console.log("Sexualmente");
    }

    nacer(): void {
        console.log("Nasco de un huevo");
    }

    respirar(): void {
        console.log("Con mis pulmones");
    }

    morir(): void{
        console.log("Yop me muero");
    }
}

var cocodrilo1 = new Cocodrilo();

cocodrilo1.comer();
cocodrilo1.desplazarse();
cocodrilo1.morir();
cocodrilo1.respirar();