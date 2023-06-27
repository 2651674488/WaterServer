import{d as S,_ as m,s as u,o as b,c as f,a as r,b as e,u as d,i as C,w as h,e as x,E as w,f as I,g as L,t as V,h as E,j as T,m as $,p as R,n as k}from"./index-a2c9c823.js";import{H as D}from"./el-table-column-aa1d3ccc.js";import{u as B,M as O}from"./region-631fc30c.js";import{s as z}from"./file-1faae522.js";import{f as y}from"./date-a462485d.js";function M(n,o,t,l,i){return D.get("/cost",{params:{region_id:n,page:o,page_count:t,user_name:l,user_code:i}})}const v=S("cost",{state:()=>({costList:[],regionId:null,page:1,pageCount:10,username:null,usercode:null,total:0,selections:null}),actions:{async fetchCostList(){const n=await M(this.regionId,this.page,this.pageCount,this.username,this.usercode);this.costList=n.data,this.total=n.total}}});const N={class:"opt-warp"},q={class:"left-opt"},H={class:"right-opt"},P={__name:"DataOptions",setup(n){const o=v(),{username:t,usercode:l}=u(o),i=()=>{o.page=1,o.fetchCostList()},s=()=>{z("费用信息",["用户名","用户编码","电话号码","账本余额","已消费","欠费余额","最后账期"],o.selections).then(()=>{w.success("导出成功")})};return(a,c)=>{const _=I,g=L;return b(),f("div",N,[r("div",q,[e(_,{modelValue:d(t),"onUpdate:modelValue":c[0]||(c[0]=p=>C(t)?t.value=p:null),placeholder:"用户名"},null,8,["modelValue"]),e(_,{modelValue:d(l),"onUpdate:modelValue":c[1]||(c[1]=p=>C(l)?l.value=p:null),placeholder:"用户编码"},null,8,["modelValue"]),e(g,{onClick:i},{default:h(()=>[x("查询")]),_:1})]),r("div",H,[e(g,{type:"primary",plain:"",onClick:s},{default:h(()=>[x("导出")]),_:1})])])}}},U=m(P,[["__scopeId","data-v-7e483051"]]);const j={class:"table-warp"},A={__name:"ContentTable",setup(n){const o=v(),{costList:t}=u(o),l=i=>{o.selections=i.map(s=>[s.username,s.user_code,s.phone_number,s.account_balance,s.consumed_amount,s.arrears_balance,y(s.last_billing_date)])};return(i,s)=>{const a=E,c=T;return b(),f("div",j,[e(c,{data:d(t),stripe:"",border:"","row-style":{height:"40px"},"cell-style":{padding:"5px"},style:{"font-size":"12px"},"show-overflow-tooltip":"",onSelectionChange:l},{default:h(()=>[e(a,{type:"selection",width:"50"}),e(a,{prop:"username",label:"用户名",width:"100"}),e(a,{prop:"user_code",label:"用户编码"}),e(a,{prop:"phone_number",label:"电话号码"}),e(a,{prop:"account_balance",label:"账本余额"}),e(a,{prop:"consumed_amount",label:"已消费"}),e(a,{prop:"arrears_balance",label:"欠费余额"}),e(a,{label:"最后账期"},{default:h(({row:_})=>[r("span",null,V(d(y)(_.last_billing_date)),1)]),_:1})]),_:1},8,["data"])])}}},Q=m(A,[["__scopeId","data-v-b3de5171"]]);const F=n=>(R("data-v-2baebdda"),n=n(),k(),n),G={class:"flow-query content-warp"},J={class:"left"},K=F(()=>r("div",{class:"title"},"所有区域",-1)),W={class:"right"},X={class:"content"},Y={class:"pagination-warp"},Z={__name:"index",setup(n){const o=B();o.fetchAllRegions();const t=v();t.fetchCostList();const{regionList:l}=u(o),{pageCount:i,total:s}=u(t),a=_=>{t.$reset(),t.regionId=_,t.fetchCostList()},c=_=>{t.page=_,t.fetchCostList()};return(_,g)=>{const p=$;return b(),f("div",G,[r("div",J,[K,e(O,{"data-list":d(l),onSelect:a},null,8,["data-list"])]),r("div",W,[e(U),r("div",X,[e(Q),r("div",Y,[e(p,{"page-size":d(i),"pager-count":9,layout:"prev, pager, next",total:d(s),background:"",small:"",onCurrentChange:c},null,8,["page-size","total"])])])])])}}},ne=m(Z,[["__scopeId","data-v-2baebdda"]]);export{ne as default};
