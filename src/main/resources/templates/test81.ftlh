<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 81</h3>
    <a class="btn btn-info" href="/get-t3">Получить</a>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Наименование услуг</th>
                    <th>Измеритель</th>
                    <th>Цена</th>

                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.NAME}</td>
                        <td>${task.MEASURE}</td>
                        <td>${task.PRICE}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>