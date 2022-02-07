<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>Таблица 58</h3>
    <div class="container my-3">
        <div class="row">
            <table class="table shadow ">
                <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Таксация лесонасаждений</th>
                    <th>Кат I</th>
                    <th>Кат II</th>
                    <th>Кат II</th>
                </tr>
                </thead>
                <#list all as task>
                    <tbody>
                    <tr>
                        <td>${task.id}</td>
                        <td>${task.NAME_TAX}</td>
                        <td>${task.DIFFF_CAT1}</td>
                        <td>${task.DIFF_CAT2}</td>
                        <td>${task.DIFF_CAT3}</td>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>

    </div>
    <#include "parts/messageList.ftlh" />
</@c.page>