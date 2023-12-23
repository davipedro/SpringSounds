package com.example.screen_sounds.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
