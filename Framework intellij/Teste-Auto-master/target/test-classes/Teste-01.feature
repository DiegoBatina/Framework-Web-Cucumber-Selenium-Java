#language: pt

Funcionalidade: [Teste de preenchimento de formulario "Automobile"]


   Cenário: [Cenario 01 formulario “Enter Vehicle Data”]
     Dado que acesso sistema Tricentis
     Quando clico na aba ”Automobile”
     Então visualizo o formulario “Enter Vehicle Data”
     E clico no campo ”Make”
     E seleciono a opcao ”Audi”
     E preencho o campo ”Engine Performance” com o valor "1.8"
     E preencho o campo ”Date of Manufacture” com o valor "21111997"
     E clico no campo ”Number of Seats”
     E seleciono a opcao ”five” no campo ”Number of Seats”
     E clico no campo ”Fuel Type”
     E seleciono a opcao ”Gas”
     E clico e insiro no campo ”List Price” o valor "20000"
     E clico e insiro no campo ”License Plate Number” o valor "CLC 9J99"
     E clico e insiro no campo ”Annual Mileage” o valor "20000"
     E pressione next

     Cenário: [Cenario 02 formulario “Enter Data Insurant”]
     Dado que acesso sistema Tricentis
     Quando clico na aba ”Automobile”
     Então clico na aba “Enter Data Insurant”
     E visualizo o formulario “Enter Data Insurant”
     E preencho o campo ”First Name” com o valor "Diego"
     E preencho o campo ”Last Name” com o valor "Batina"
     E preencho o campo ”Date of Birth” com o valor "07171989"
     E seleciono o genero ”Male” no campo ”Gender”
     E preencho o campo ”Street Address” com o valor "Rua dos testes"
     E clico no campo ”Country”
     E seleciono a opcao ”Brazil”
     E clico e insiro no campo ”Zip Code” o valor "02322130"
     E clico e insiro no campo ”City” o valor "São Paulo SP"
     E clico no campo ”Occupation”
     E seleciono a opcao ”self employed”
     E seleciono ”Speeding” no campo ”Hobbies”
     E preencho o campo ”Website” com o valor "linkedin.com/in/diego-correa-batina-0b7b34196/"
     E clico em ”Open” no campo ”Picture” para fazer upload de imagem
     E seleciono a "imagem.jpg" na busca no campo ”Picture”
     E pressione ”Next” na aba ”Enter Data Insurant”

     Cenário: [Cenario 03 formulario ”Enter Product Data”]
       Dado que acesso sistema Tricentis
       Quando clico na aba ”Automobile”
       Então clico na aba ”Enter Product Data”
       E visualizo o formulario “Enter Product Data”
       E insiro o valor "16032021" no campo ”Start Date”
       E clico no campo ”Insurance Sum”
       E seleciono a segunda opcao de valor no campo ”Insurance Sum”
       E clico no campo ”Merit Rating”
       E seleciono a primeira opcao no campo ”Merit Rating”
       E clico no campo ”Damage Insurance”
       E seleciono a opcao ”No Coverage” no campo ”Damage Insurance”
       E seleciono a opcao ”Euro Protection” no campo ”Optional Products”
       E clico no campo ”Courtesy Car”
       E seleciono a opcao ”No” no campo ”Courtesy Car”
       E pressione ”Next” na aba ”Enter Product Data”

       Cenário: [Cenario 04 formulario ”Send Quote”]
         Dado que acesso sistema Tricentis
         Quando clico na aba ”Automobile”
         Então visualizo o formulario “Enter Vehicle Data”
         E clico no campo ”Make”
         E seleciono a opcao ”Audi”
         E preencho o campo ”Engine Performance” com o valor "1.8"
         E preencho o campo ”Date of Manufacture” com o valor "21112012"
         E clico no campo ”Number of Seats”
         E seleciono a opcao ”five” no campo ”Number of Seats”
         E clico no campo ”Fuel Type”
         E seleciono a opcao ”Gas”
         E clico e insiro no campo ”List Price” o valor "20000"
         E clico e insiro no campo ”License Plate Number” o valor "CLC 9J99"
         E clico e insiro no campo ”Annual Mileage” o valor "20000"
         E pressione next
         E clico na aba “Enter Data Insurant”
         E visualizo o formulario “Enter Data Insurant”
         E preencho o campo ”First Name” com o valor "Diego"
         E preencho o campo ”Last Name” com o valor "Batina"
         E preencho o campo ”Date of Birth” com o valor "07171989"
         E seleciono o genero ”Male” no campo ”Gender”
         E preencho o campo ”Street Address” com o valor "Rua dos testes"
         E clico no campo ”Country”
         E seleciono a opcao ”Brazil”
         E clico e insiro no campo ”Zip Code” o valor "02322130"
         E clico e insiro no campo ”City” o valor "São Paulo SP"
         E clico no campo ”Occupation”
         E seleciono a opcao ”self employed”
         E seleciono ”Speeding” no campo ”Hobbies”
         E preencho o campo ”Website” com o valor "linkedin.com/in/diego-correa-batina-0b7b34196/"
         E clico em ”Open” no campo ”Picture” para fazer upload de imagem
         E seleciono a "imagem.jpg" na busca no campo ”Picture”
         E pressione ”Next” na aba ”Enter Data Insurant”
         E clico na aba ”Enter Product Data”
         E visualizo o formulario “Enter Product Data”
         E insiro o valor "16032021" no campo ”Start Date”
         E clico no campo ”Insurance Sum”
         E seleciono a segunda opcao de valor no campo ”Insurance Sum”
         E clico no campo ”Merit Rating”
         E seleciono a primeira opcao no campo ”Merit Rating”
         E clico no campo ”Damage Insurance”
         E seleciono a opcao ”No Coverage” no campo ”Damage Insurance”
         E seleciono a opcao ”Euro Protection” no campo ”Optional Products”
         E clico no campo ”Courtesy Car”
         E seleciono a opcao ”No” no campo ”Courtesy Car”
         E pressione ”Next” na aba ”Enter Product Data”