<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 80</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Сметная стоимость изысканий</th>
                    <th>Цена</th>

                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.ESTIMATED_COST_OF_SURVEYS}</td>
                        <td>${task.REGISTRATION_PRICE}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>