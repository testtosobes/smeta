<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Тестовый запрос</h3>
    <a class="btn btn-info" href="/get-t3">Получить</a>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Районный коэффициент к заработной плате</th>
                    <th>Коэффициент к итогу сметной стоимости изысканий</th>
                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.DISTRICT_WAGES_RATIO}</td>
                        <td>${task.DISTRICT_ESTIMATE_RATIO}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>