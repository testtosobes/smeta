<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 2</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Продолжительность неблагоприятного периода, мес</th>
                    <th>Коэффициент</th>
                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.UNFAVOR_PERIOD}</td>
                        <td>${task.RATIO}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>