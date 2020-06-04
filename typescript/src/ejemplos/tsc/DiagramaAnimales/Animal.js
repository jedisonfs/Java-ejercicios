var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal() {
    }
    return Animal;
}());
var Vertebrados = /** @class */ (function (_super) {
    __extends(Vertebrados, _super);
    function Vertebrados() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Vertebrados;
}(Animal));
var Reptil = /** @class */ (function (_super) {
    __extends(Reptil, _super);
    function Reptil() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Reptil.prototype.desplazarse = function () {
        console.log("me desplazo en 4 patas");
    };
    Reptil.prototype.reproducirse = function () {
        console.log("Sexualmente");
    };
    Reptil.prototype.nacer = function () {
        console.log("De un huevo");
    };
    return Reptil;
}(Vertebrados));
var Cocodrilo = /** @class */ (function (_super) {
    __extends(Cocodrilo, _super);
    function Cocodrilo() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Cocodrilo.prototype.comer = function () {
        console.log("Soy carnivoro");
    };
    Cocodrilo.prototype.desplazarse = function () {
        console.log("Me desplazo en 4 patas");
    };
    Cocodrilo.prototype.reproducirse = function () {
        console.log("Sexualmente");
    };
    Cocodrilo.prototype.nacer = function () {
        console.log("Nasco de un huevo");
    };
    Cocodrilo.prototype.respirar = function () {
        console.log("Con mis pulmones");
    };
    Cocodrilo.prototype.morir = function () {
        console.log("Yop me muero");
    };
    return Cocodrilo;
}(Reptil));
var cocodrilo1 = new Cocodrilo();
cocodrilo1.comer();
cocodrilo1.desplazarse();
cocodrilo1.morir();
cocodrilo1.respirar();
