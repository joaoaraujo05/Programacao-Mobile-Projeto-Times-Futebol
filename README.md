# Projeto Futebol - Times Brasileiros

Aplicativo Android desenvolvido para a atividade parcial de Android Views (XML) e navegação com Intent, da disciplina de Programação Mobile I.

## Objetivo do aplicativo

O aplicativo apresenta uma lista de times do futebol brasileiro. Ao tocar em um dos times, o usuário é levado para uma tela de detalhes que mostra o escudo, a cidade, o ano de fundação e o estádio. Nessa tela também é possível marcar o time como favorito tocando na estrela da barra superior e voltar para a lista pela seta.

Todos os dados exibidos são simulados diretamente no código, então o projeto não depende de API, banco de dados, chaves ou senhas para funcionar.

## Como rodar o projeto localmente

É necessário ter o Android Studio instalado. Ele já inclui o JDK e instala o Android SDK necessário. O aplicativo roda em emuladores ou celulares com Android 7.0 (API 24) ou superior.

1. Clone o repositório com `git clone` ou baixe o projeto pelo GitHub em Code > Download ZIP e extraia o arquivo.
2. No Android Studio, vá em File > Open e selecione a pasta raiz do projeto, que é a pasta onde está o arquivo `settings.gradle.kts`.
3. Aguarde a sincronização do Gradle terminar. Na primeira vez, o Android Studio baixa as dependências automaticamente e isso pode levar alguns minutos. Caso ele peça para instalar algum SDK ou ferramenta, basta aceitar.
4. Selecione um dispositivo na barra superior. Se ainda não houver um emulador, é possível criar um pelo Device Manager, por exemplo, um Pixel 7 com API 34.
5. Com a configuração `app` selecionada, clique no botão Run.

## Bibliotecas utilizadas

O projeto usa apenas bibliotecas oficiais do Android, que são baixadas automaticamente pelo Gradle ao abrir o projeto.

- **AndroidX Core KTX**: oferece extensões em Kotlin para o Android e é usada para ajustar o layout às barras do sistema.
- **AndroidX AppCompat**: fornece a classe base das telas (`AppCompatActivity`), o suporte a Fragments e a compatibilidade com versões mais antigas do Android.
- **Material Components**: responsável pelo tema escuro do aplicativo e pela barra superior das telas (`MaterialToolbar`).
- **AndroidX Activity**: usada para permitir que o conteúdo ocupe a tela inteira.
- **AndroidX RecyclerView**: exibe a lista de times na primeira tela.
- **AndroidX ConstraintLayout**: dependência que já vem no modelo de projeto do Android Studio.
- **JUnit, AndroidX Test e Espresso**: bibliotecas de teste incluídas pelo modelo do Android Studio. O aplicativo não as utiliza diretamente.

Os escudos dos clubes pertencem aos seus respectivos donos e foram usados somente para fins acadêmicos.

---

Desenvolvido por João Pedro Leme Araújo - Programação Mobile I, UNAERP.
