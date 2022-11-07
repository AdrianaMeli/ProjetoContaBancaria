package Teste;

import conta.Conta;
import Teste.TestaConta;
import model.model;

public class TestaConta {

        public static void main(String[] args) {

            model c1 = new model(123456, 123, 1, "João da Silva", 2000.0f);
            c1.visualizar();

            model c2 = new model(123456, 123, 1, "João da Silva", 2000.0f);
            c2.visualizar();

            c1.setSaldo(100000.0f);
            c1.setTitular("Maria Joaquina");
            c1.visualizar();

        }

    }

