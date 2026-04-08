# 🚗 Sistema de Veículos em Java (POO)

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), implementando um sistema de veículos com uso de herança.

---

## 🚀 Funcionalidades

### 🚘 Classe Veiculo (base)
- Armazena:
  - Peso (kg)
  - Velocidade máxima (Km/h)
  - Preço (R$)
- Permite:
  - ✔️ Criar objetos com valores padrão ou personalizados
  - ✔️ Alterar dados com setters
  - ✔️ Acessar dados com getters
  - ✔️ Entrada de dados via usuário
  - ✔️ Impressão das informações

---

### 🚗 Classe CarroPasseio
- Herda de `Veiculo`
- Adiciona:
  - Cor
  - Modelo
- Possui todas as funcionalidades da classe base + atributos específicos

---

### 🚚 Classe Caminhao
- Herda de `Veiculo`
- Adiciona:
  - Capacidade de carga (toneladas)
  - Altura máxima
  - Comprimento
- Permite manipulação completa dos dados do caminhão

---

## 🧠 Conceitos aplicados

- Encapsulamento (`private`, getters e setters)
- Construtores (padrão e parametrizado)
- Herança (`extends`)
- Reutilização de código
- Organização em pacotes
- Entrada e saída de dados

---

## 📦 Estrutura do projeto


src/
├── principal/
│ └── Principal.java
└── modelos/
├── Veiculo.java
├── CarroPasseio.java
└── Caminhao.java


---

## 💻 Exemplo de uso

```java
CarroPasseio carro = new CarroPasseio();

carro.SolicitarDados();
carro.MostrarDados();
```
<img width="538" height="118" alt="Captura de tela 2026-04-08 155438" src="https://github.com/user-attachments/assets/49652aa1-1387-4700-be30-ce95740b909e" />

## 🎯 Objetivo

Este projeto foi desenvolvido com fins educacionais para praticar conceitos fundamentais de Programação Orientada a Objetos em Java, com foco em herança e organização de classes.

## 🧑‍💻 Autor

Mateus Fraga

## ⭐ Possíveis melhorias
 - Validação de dados (valores negativos, limites)
 - Interface gráfica (JavaFX ou Swing)
 - Persistência de dados (arquivo ou banco)
 - Testes automatizados (JUnit)
 - Menu interativo no console
