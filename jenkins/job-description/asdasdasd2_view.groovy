 
listView('asdasdasd2 Jobs') {
    description('asdasdasd2 Jobs')
    jobs {
        regex('asdasdasd2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
