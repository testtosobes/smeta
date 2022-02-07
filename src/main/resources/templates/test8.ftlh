<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 8</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Вид сетей</th>
                    <th>Класс точности</th>
                    <th>Кат I полевые</th>
                    <th>Кат I камеральные</th>
                    <th>Кат II полевые</th>
                    <th>Кат II камеральные</th>
                    <th>Кат III полевые</th>
                    <th>Кат III камеральные</th>
                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.TYPE}</td>
                        <td>${task.CLASS}</td>
                        <td>${task.CAT1_FIELD}</td>
                        <td>${task.CAT1_CAMERAL}</td>
                        <td>${task.CAT2_FIELD}</td>
                        <td>${task.CAT2_CAMERAL}</td>
                        <td>${task.CAT3_FIELD}</td>
                        <td>${task.CAT3_CAMERAL}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>