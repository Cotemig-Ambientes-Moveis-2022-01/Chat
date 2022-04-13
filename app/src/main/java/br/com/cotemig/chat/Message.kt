package br.com.cotemig.chat

class Message(var message: String, var picture: Int, var type: Int) {
    constructor(picture: Int, type: Int) : this("", picture, type)
    constructor(message: String, type: Int) : this(message, 0, type)
}