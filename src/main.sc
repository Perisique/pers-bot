theme: /

    state: /hello
        q!: привет*
        q!: добр*
        q!: хай*
        q!: хеллоу*
        q!: здравствуй*
        a: Анимее
    state: /weather
        q!: погод*
        q!: (осадк*/~дождь/~снег/~град)
        a: ну и кринж ты спрашиваешь, ты мастер смол толка?
    state: /currency
        q!: валют*
        q!: рубл*
        q!: доллар*
        q!: сколько
        q!: ~перевод
        a: да, сейчас всё посчитаем
    state: /NoMatch
        event!: noMatch
        a: Что ты сказал, существо? Ну даёшь