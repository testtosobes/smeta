<#include "security.ftlh">
<#import "login.ftlh" as l>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Смета</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/estimate">Новая смета</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/journal">Журнал</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/test2">T2</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test3">T3</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test4">T4</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test5">T5</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test8">T8</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test9">T9</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test58">T58</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test80">T80</a>
            </li><li class="nav-item">
                <a class="nav-link" href="/test81">T81</a>
            </li>
        </ul>

        <div class="navbar-text mr-3"><#if user??>${name}<#else>Авторизуйся</#if></div>
        <@l.logout />
    </div>
</nav>