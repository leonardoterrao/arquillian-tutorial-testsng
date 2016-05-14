# Arquillian com TestNG

- Link oficial do Arquillian: http://arquillian.org/
- Link oficial do TestNG: http://testng.org/doc/index.html

Projeto muito simples que não funciona para vida real em grandes projetos mas da para ter uma ideia das configurações básicas. O projeto está rodanto os testes utilizando arquillian junto com testng. O teste rodam em um container weld *embeddable* no profile **weld** e podem ser rodado também com wildfly também *embeddable* no profile **wildfly**.

Comandos para executar os testes:
```sh
$ mvn test -P wildfly
$ mvn test -P weld
```
