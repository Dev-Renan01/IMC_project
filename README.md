# 📱 IMC App — Calculadora de Índice de Massa Corporal

Aplicativo Android desenvolvido na disciplina de **Desenvolvimento Mobile (3º Período - 2025)**.

---

## 👥 Equipe

| Nome         | Matrícula  | Turma |
| ------------ | ---------- | ----- |
| Suany Souza  | 2025100220 | Noite |
| Thiago Renan | 2025100218 | Noite |

**Professor:** Fabiano Silva

---

## 📋 Sobre o Projeto

O **IMC App** é um aplicativo Android nativo desenvolvido em **Java** que permite ao usuário calcular e interpretar seu **Índice de Massa Corporal (IMC)** de forma rápida, simples e intuitiva.

O aplicativo possui um fluxo composto por **3 telas**, validação de entrada de dados com **AlertDialog**, classificação visual por cores e mensagens personalizadas de acordo com o resultado obtido.

---

## ✨ Funcionalidades

* ✅ Navegação entre 3 telas
* ✅ Cálculo automático do IMC
* ✅ Validação de campos com AlertDialog
* ✅ Classificação conforme tabela da OMS
* ✅ Cores semânticas para cada faixa de IMC
* ✅ Mensagens personalizadas
* ✅ Botão de retorno entre telas
---

## 🖥️ Telas do Aplicativo

### 🏠 Tela 1 — Splash (Tela Inicial)

* Apresentação do aplicativo
* Ícone e descrição
* Botão **COMEÇAR**

### 📝 Tela 2 — Formulário

* Campo para Peso (kg)
* Campo para Altura (m)
* Validação de dados
* Botão **CALCULAR**
* Botão **VOLTAR**
* Tabela de referência do IMC

### 📊 Tela 3 — Resultado

* Exibição do IMC calculado
* Classificação por faixa
* Mensagem personalizada
* Dica de saúde
* Botão **CALCULAR NOVAMENTE**

---

## 🎨 Classificação de IMC

| Classificação      | Faixa de IMC | Cor                |
| ------------------ | ------------ | ------------------ |
| Abaixo do Peso     | < 18.5       | 🔵 Azul            |
| Peso Normal        | 18.5 – 24.9  | 🟢 Verde           |
| Sobrepeso          | 25.0 – 29.9  | 🟠 Laranja         |
| Obesidade Grau I   | 30.0 – 34.9  | 🔴 Vermelho Claro  |
| Obesidade Grau II  | 35.0 – 39.9  | 🔴 Vermelho        |
| Obesidade Grau III | ≥ 40.0       | 🔴 Vermelho Escuro |

---

## 🔄 Fluxo de Navegação

```text
Tela Inicial
     │
     ▼
 Formulário
     │
     ├── Dados inválidos → AlertDialog
     │
     ▼
 Resultado
     │
     ▼
 Calcular Novamente
     │
     ▼
 Formulário
```

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia                 | Descrição                   |
| -------------------------- | --------------------------- |
| Java                       | Linguagem principal         |
| Android Studio             | Ambiente de desenvolvimento |
| Android API 21+            | Compatibilidade mínima      |
| Git                        | Controle de versão          |
| GitHub                     | Hospedagem do código        |

---

## 📱 Como Utilizar

1. Abra o aplicativo.
2. Toque em **COMEÇAR**.
3. Informe seu peso (kg).
4. Informe sua altura (m).
5. Toque em **CALCULAR**.
6. Visualize o resultado.
7. Utilize **CALCULAR NOVAMENTE** para um novo cálculo.

---

## 🧪 Testes Realizados

* ✅ Campos vazios
* ✅ Valores negativos
* ✅ Valores zerados
* ✅ Todas as faixas de IMC
* ✅ Navegação entre telas
* ✅ Múltiplos cálculos consecutivos
