import{_ as h,o as e,c as a,b as o,w as t,q as M,F as r,v as _,x as u,u as L,y as k,a as B,t as l,e as E,z as b,A as I,B as R,d as w}from"./index-a2c9c823.js";import{H as A}from"./el-table-column-aa1d3ccc.js";const N={class:"m-list"},V={__name:"index",props:{dataList:{type:Array,default:()=>[]}},emits:["select"],setup(n,{emit:d}){function m(c){d("select",c)}return(c,v)=>{const p=b,f=I,g=R,x=M;return e(),a("div",N,[o(x,{onSelect:m},{default:t(()=>[(e(!0),a(r,null,_(n.dataList,(s,y)=>(e(),u(g,{key:y,index:String(s.id)},{title:t(()=>[o(p,null,{default:t(()=>[o(L(k))]),_:1}),B("span",null,l(s.name),1)]),default:t(()=>[(e(!0),a(r,null,_(s.children,(i,S)=>(e(),u(f,{key:S,index:String(i.id)},{default:t(()=>[E(l(i.name),1)]),_:2},1032,["index"]))),128))]),_:2},1032,["index"]))),128))]),_:1})])}}},z=h(V,[["__scopeId","data-v-807926a5"]]);function q(){return A.get("/region")}const C=w("region",{state:()=>({regionList:[]}),actions:{async fetchAllRegions(){const n=await q();this.regionList=n.data}}});export{z as M,C as u};
